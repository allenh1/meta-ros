# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Test messages for rosjava."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/rosjava-release/rosjava_test_msgs-release/archive/release/kinetic/rosjava_test_msgs/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "891097bc86608bf0e76a04a53b8066a8"
SRC_URI[sha256sum] = "5923bce29d4fa4a29dcd3400ebf777fa3ad611318ff33b1e109331f3a8c2245b"
S = "${WORKDIR}/rosjava_test_msgs-release-release-kinetic-rosjava_test_msgs-0.3.0-0"

inherit catkin
