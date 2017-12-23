# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by rocon interactions."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime rocon-std-msgs uuid-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/rocon_interaction_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c4f10427beb322209b003ba0b30a87a0"
SRC_URI[sha256sum] = "165503fe80f4f85ddd4bd4d5f02579c4542bb3a88794b023befdb8b1cac247db"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-rocon_interaction_msgs-0.9.0-1"

inherit catkin
