# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used to feed the trolls."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native message-generation message-runtime uuid-msgs"
SRC_URI = "https://github.com/stonier/feed_the_troll_msgs-release/archive/release/kinetic/feed_the_troll_msgs/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5a4351c3f75258b32249510b7fca1c6"
SRC_URI[sha256sum] = "075cf9581432b2585529375d7e86772a8b3b0690910f9dcf2fa7656f8624f3ba"
S = "${WORKDIR}/feed_the_troll_msgs-release-release-kinetic-feed_the_troll_msgs-0.1.1-0"

inherit catkin
