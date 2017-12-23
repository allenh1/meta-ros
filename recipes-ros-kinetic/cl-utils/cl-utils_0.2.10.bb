# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common Lisp utility libraries"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native sbcl"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/kinetic/cl_utils/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f2f98ed6f58538006552283b6899847f"
SRC_URI[sha256sum] = "c77d00e1fad1eea33dae2d1554f3ddfe1bb426392a96007dd42e1ad6fbf07fcc"
S = "${WORKDIR}/roslisp_common-release-release-kinetic-cl_utils-0.2.10-0"

inherit catkin
