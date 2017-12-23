# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Variant messages are designed to accommodate the information content     of any "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=146ba316845cfe6058c8baebd902a726"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ethz-asl/variant-release/archive/release/kinetic/variant_msgs/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "63e213462276a2f8ae91a8727e4e6669"
SRC_URI[sha256sum] = "bc6aacd74f494866a7a497b0b77d0e31335f5554cbf3cc7bb07bce6edffe3b09"
S = "${WORKDIR}/variant-release-release-kinetic-variant_msgs-0.1.3-0"

inherit catkin
