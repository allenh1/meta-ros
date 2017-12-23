# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "IKFast package for NEXTAGE Open"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native liblapack-dev moveit-core pluginlib roscpp tf-conversions"
SRC_URI = "https://github.com/tork-a/rtmros_nextage-release/archive/release/kinetic/nextage_ik_plugin/0.8.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ebb9764cf886b276851bc80d36c3af43"
SRC_URI[sha256sum] = "5275b275b445d4f49afe19f1c5804c1977aaba98fc54673db49140cb061ad296"
S = "${WORKDIR}/rtmros_nextage-release-release-kinetic-nextage_ik_plugin-0.8.3-0"

inherit catkin
