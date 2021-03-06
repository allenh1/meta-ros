# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_hark_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/jsk_hark_msgs/4.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "90b627a18cf704dbf891e50989cba760"
SRC_URI[sha256sum] = "3466ba3d0b07c73cecdd1a6150aa7ce25c31ac49720873d806d8bd3e1048eab0"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-jsk_hark_msgs-4.2.0-0"

inherit catkin
