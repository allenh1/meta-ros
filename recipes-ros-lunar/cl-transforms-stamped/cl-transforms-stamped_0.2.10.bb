# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implementation of TF datatypes"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cl-transforms geometry-msgs roslisp std-msgs"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/lunar/cl_transforms_stamped/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "76e96c63f6f3ec0310d2892a9ccae0cc"
SRC_URI[sha256sum] = "cda03cf8b12cf84870ba0584709a753724ca60c67fa520f2455e58153d5e98fb"
S = "${WORKDIR}/roslisp_common-release-release-lunar-cl_transforms_stamped-0.2.10-0"

inherit catkin
