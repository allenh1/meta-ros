# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Some utility functionality to interact with ROS using roslisp."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roslisp"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/kinetic/roslisp_utilities/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "836debcb47583f720f5ef5f4fbae6bec"
SRC_URI[sha256sum] = "cd6e49104a91f3b656d4b320983a1fcaa252b42d7667df6b752c8c71aa0e1eca"
S = "${WORKDIR}/roslisp_common-release-release-kinetic-roslisp_utilities-0.2.10-0"

inherit catkin
