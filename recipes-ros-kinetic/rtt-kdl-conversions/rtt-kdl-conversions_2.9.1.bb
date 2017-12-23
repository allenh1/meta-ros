# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the components of the kdl_conversions package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native kdl-conversions rtt"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_kdl_conversions/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8a6c5192211fba8a49a9215ff16a9cae"
SRC_URI[sha256sum] = "64797229d92e8ec44f4886bd7203167cf302d58629e4c7fda1e5fba4b68e0dcf"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_kdl_conversions-2.9.1-0"

inherit catkin
