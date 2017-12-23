# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implementation of TF datatypes"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cl-transforms geometry-msgs roslisp std-msgs"
SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/kinetic/cl_transforms_stamped/0.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db4c1fe579dfb78317d8fcf96b0acaac"
SRC_URI[sha256sum] = "a548fdd29d7f94801a92f728288bca3529aae7b5d67ad4adb143546eec9b4562"
S = "${WORKDIR}/roslisp_common-release-release-kinetic-cl_transforms_stamped-0.2.10-0"

inherit catkin
