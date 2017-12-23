# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pr2eus"
SRC_URI = "https://github.com/tork-a/jsk_pr2eus-release/archive/release/kinetic/jsk_pr2eus/0.3.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d8b0b4915cffec347db461a728a7cf9a"
SRC_URI[sha256sum] = "6e6b8c637f35fcad506fd0f6b8a64bba5f6ec2c88d4b92e946fdb4859aa86340"
S = "${WORKDIR}/jsk_pr2eus-release-release-kinetic-jsk_pr2eus-0.3.10-0"

inherit catkin
