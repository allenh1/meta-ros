# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Basic test nodes for Pyros dynamic ROS interface"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime roslint rospy std-msgs"
SRC_URI = "https://github.com/pyros-dev/${PN}-release/archive/release/lunar/pyros_test/0.0.6-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1240be961567608fff20e5bf173f72e4"
SRC_URI[sha256sum] = "ac0c1b21b4f9dba37e5c0d0cb16692c5b51b02123ecc9a068696da3380eb5872"
S = "${WORKDIR}/${PN}-release-release-lunar-pyros_test-0.0.6-1"

inherit catkin
