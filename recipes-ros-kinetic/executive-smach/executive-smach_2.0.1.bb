# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage depends on the SMACH library and ROS SMACH integration     pack"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native smach smach-msgs smach-ros"
SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/kinetic/executive_smach/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e3b3ab0df79c9ee1473d50be11baa956"
SRC_URI[sha256sum] = "f5c17a26e1235ce460026d47e673f955e9fc04ea7c432dadde2cf1654fe257ac"
S = "${WORKDIR}/executive_smach-release-release-kinetic-executive_smach-2.0.1-0"

inherit catkin
