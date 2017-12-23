# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Shared communication types for the concert framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native gateway-msgs message-generation message-runtime rocon-app-manager-msgs rocon-std-msgs std-msgs uuid-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/concert_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "21e65f179fad970d469cc78effd5261a"
SRC_URI[sha256sum] = "5f4d45afbfaecbe8322955b7007b125fba4eda3eb3541f51cb7376c7567fd68b"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-concert_msgs-0.9.0-1"

inherit catkin
