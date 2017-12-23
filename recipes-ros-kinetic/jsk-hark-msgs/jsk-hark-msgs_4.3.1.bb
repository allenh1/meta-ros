# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_hark_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/kinetic/jsk_hark_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98b4fc9824d336c01c897843f0d54857"
SRC_URI[sha256sum] = "fefb28507bf08df56728f9b54e38174091c1b953d85596b3a04248355b9a266c"
S = "${WORKDIR}/jsk_common_msgs-release-release-kinetic-jsk_hark_msgs-4.3.1-0"

inherit catkin
