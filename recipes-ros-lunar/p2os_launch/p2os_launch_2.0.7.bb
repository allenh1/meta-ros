# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch and config files designed for use with the p2os stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=d0f4dc99af5b99accd170c184aae042c"

DEPENDS = "catkin"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_launch/2.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b8271c79890e0a9050e48038af47f4b"
SRC_URI[sha256sum] = "710e7c07506efcc4457b2bbb4ebc2320361e745bc35673d04c5fca33401814dc"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
