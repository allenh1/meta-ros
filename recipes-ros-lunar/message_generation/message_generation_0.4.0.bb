# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package modeling the build-time dependencies for generating language bindings of"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=fa6af719a6de9a71f0ffba9c1452faa9"

DEPENDS = "catkin gencpp geneus genlisp genmsg gennodejs genpy"
SRC_URI = "https://github.com/ros-gbp/message_generation-release/archive/release/lunar/message_generation/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b32f43c1c811e4cb20899fb0e193ae69"
SRC_URI[sha256sum] = "10df5531fc4b958275f5141df99394c9e4532c7a72d9ace70c9283465304dcf8"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
