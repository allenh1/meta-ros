# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS camera driver that uses gstreamer to connect to     devices such as webcam"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers camera-info-manager catkin-native cv-bridge image-transport libgstreamer-plugins-base0.10-dev libgstreamer0.10-dev nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/${PN}-release/archive/release/kinetic/${PN}/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "43c97297c35d878524f5f4fc74511a02"
SRC_URI[sha256sum] = "221166b3df8e0658a96aec05f0da228d79d3dfee2052b463dfcc0fb603c5de0f"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.2.0-0"

inherit catkin
