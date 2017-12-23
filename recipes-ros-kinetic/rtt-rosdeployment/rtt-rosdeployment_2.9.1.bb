# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rtt_rosdeployment provides an RTT plugin to control an ocl deployment component "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp rtt-ros rtt-ros-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_rosdeployment/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "941d5a3db5d878677ed33623af99aa28"
SRC_URI[sha256sum] = "0a01448b81141e4b478abb90a4ceb42dc66bee97aa38adc5c6ff02ea484f0202"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_rosdeployment-2.9.1-0"

inherit catkin
