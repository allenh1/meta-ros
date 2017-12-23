# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The katana_moveit_ikfast_plugin package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & Apache-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native liblapack-dev moveit-core pluginlib roscpp tf-conversions"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/kinetic/katana_moveit_ikfast_plugin/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "028275a80ed5e94324a9536cccc02453"
SRC_URI[sha256sum] = "354967660e9f9f5fa71f10857dad8ed817846895b6cda6c22e6e5d54c256ab2c"
S = "${WORKDIR}/katana_driver-release-release-kinetic-katana_moveit_ikfast_plugin-1.1.2-0"

inherit catkin
