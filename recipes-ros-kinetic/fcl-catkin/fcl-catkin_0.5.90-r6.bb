# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "fcl_catkin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen libccd-dev octomap"
SRC_URI = "https://github.com/wxmerkt/fcl_catkin-release/archive/release/kinetic/fcl_catkin/0.5.90-6.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "843897684037ccf51d4a3fa0ea941821"
SRC_URI[sha256sum] = "dab725942535d831d63c580c2551387dbb372f672f4d018fb8103a7255d065b1"
S = "${WORKDIR}/fcl_catkin-release-release-kinetic-fcl_catkin-0.5.90-6"

inherit catkin
