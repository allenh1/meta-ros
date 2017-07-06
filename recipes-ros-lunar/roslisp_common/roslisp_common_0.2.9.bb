# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=14;endline=14;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib_lisp catkin cl_tf cl_tf2 cl_transforms cl_transforms_stamped cl_urdf cl_utils roslisp_utilities"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/roslisp_common/0.2.9-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "011afb8d9d5babe190936ec2e9df2705"
SRC_URI[sha256sum] = "bbb4e1784f0301a5cda20f13dddc06292aac7df366453ea8f0b09ac9eb5cefa7"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
