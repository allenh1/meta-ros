# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The bin_pose_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/durovsky/binpicking_utils-release/archive/release/kinetic/bin_pose_msgs/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2932e33bad483d34aff8efc88f27c8af"
SRC_URI[sha256sum] = "1f60038100de99ed7041d53ca36fd4cf1a76ad3fa6e546869ee347265805bd73"
S = "${WORKDIR}/binpicking_utils-release-release-kinetic-bin_pose_msgs-0.1.4-0"

inherit catkin
