# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=32;endline=32;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "abb-driver catkin-native joint-state-publisher robot-state-publisher roslaunch rviz"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_irb6600_support/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bf19001be19178f21470f0ea8031dd74"
SRC_URI[sha256sum] = "55861d117d65932f565bcc078ae354f83b8ae440247e578fe9b0f8024aa0b545"
S = "${WORKDIR}/abb-release-release-kinetic-abb_irb6600_support-1.3.0-1"

inherit catkin
