# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Synchronize the local ROS master to the remote masters       discovered by maste"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native master-discovery-fkie multimaster-msgs-fkie rosgraph roslib rospy"
SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/kinetic/master_sync_fkie/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b7bad52bd434d7f2b255e75d28a76b2c"
SRC_URI[sha256sum] = "d4fa89dacee47c597ad38bb4f875a87bd42f50133c37b9552496f00155e45ece"
S = "${WORKDIR}/multimaster_fkie-release-release-kinetic-master_sync_fkie-0.7.7-0"

inherit catkin
