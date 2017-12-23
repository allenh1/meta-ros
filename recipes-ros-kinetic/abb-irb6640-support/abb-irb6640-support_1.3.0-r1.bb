# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=30;endline=30;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "abb-driver catkin-native joint-state-publisher robot-state-publisher roslaunch rviz xacro"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_irb6640_support/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4273458a03846fd9b1a3c51a1e6aadd2"
SRC_URI[sha256sum] = "6d57c94b306f0b4e7336addaacc64e932f5c7e85c5ccec7cc97447483045ba35"
S = "${WORKDIR}/abb-release-release-kinetic-abb_irb6640_support-1.3.0-1"

inherit catkin
