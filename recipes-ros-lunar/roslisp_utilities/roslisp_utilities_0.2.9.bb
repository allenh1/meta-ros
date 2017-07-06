# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=15;endline=15;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin roslisp"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/roslisp_utilities/0.2.9-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8de4a5ef8faac487963c6c01ce990b0b"
SRC_URI[sha256sum] = "f396391397a367f90bc69662be72b0784e1b4d40664a8da5b04bc2a198d0c73b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
