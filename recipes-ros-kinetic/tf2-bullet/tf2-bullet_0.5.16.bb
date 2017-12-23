# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_bullet"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bullet catkin-native geometry-msgs pkgconfig tf2"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/tf2_bullet/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c9929ca53700234fe55042b8ee9c805"
SRC_URI[sha256sum] = "02d4070099d899df9753ffe6feabd910233d5960fcaa0011a7b5a136fc4fccee"
S = "${WORKDIR}/geometry2-release-release-kinetic-tf2_bullet-0.5.16-0"

inherit catkin
