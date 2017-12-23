# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver module between Aldebaran's NAOqiOS and ROS. It publishes all sensor and a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cv-bridge diagnostic-msgs diagnostic-updater geometry-msgs image-transport kdl-parser naoqi-bridge-msgs naoqi-libqi naoqi-libqicore orocos-kdl robot-state-publisher rosbag-storage rosgraph-msgs sensor-msgs tf2-geometry-msgs tf2-msgs tf2-ros"
SRC_URI = "https://github.com/ros-naoqi/naoqi_driver-release/archive/release/kinetic/naoqi_driver/0.5.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7b9bbb2609654d8a0d4498cabf706b7b"
SRC_URI[sha256sum] = "3ae2ca5cd0e841b7078e9192cc7bf92f5e93cf18ceb63267d59dfca47c3d6ecb"
S = "${WORKDIR}/naoqi_driver-release-release-kinetic-naoqi_driver-0.5.9-0"

inherit catkin
