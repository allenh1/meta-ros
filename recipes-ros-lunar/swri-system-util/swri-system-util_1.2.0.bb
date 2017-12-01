# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_system_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_system_util/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e7ba16f1ffe02b4c4aa96023d77d2920"
SRC_URI[sha256sum] = "ea8d6566f8ee2878842b606e8c548d0696e47628cd870d34a5186562040f5375"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_system_util-1.2.0-0"

inherit catkin
