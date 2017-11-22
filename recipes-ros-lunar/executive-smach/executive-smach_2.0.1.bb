# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage depends on the SMACH library and ROS SMACH integration     pack"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin smach smach-msgs smach-ros"
SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/lunar/executive_smach/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4c62c0c3f9778ff7be548953d4cc92f5"
SRC_URI[sha256sum] = "37cb80b39b90d5a9095440afe5aaf447e14ca96f761d63d97e17104e28a0b017"
S = "${WORKDIR}/executive_smach-release-release-lunar-executive_smach-2.0.1-0"

inherit catkin
