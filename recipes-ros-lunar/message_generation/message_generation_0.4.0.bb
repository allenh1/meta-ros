# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin gencpp geneus genlisp genmsg gennodejs genpy"
SRC_URI = "https://github.com/ros-gbp/message_generation-release/archive/release/lunar/message_generation/0.4.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b32f43c1c811e4cb20899fb0e193ae69"
SRC_URI[sha256sum] = "10df5531fc4b958275f5141df99394c9e4532c7a72d9ace70c9283465304dcf8"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
