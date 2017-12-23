# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The gx_sound_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native message-generation"
SRC_URI = "https://github.com/groove-x/gx_sound-release/archive/release/kinetic/gx_sound_msgs/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ef8ece59d86a090ef29f2a79bba4410"
SRC_URI[sha256sum] = "834fc3c54921a462d9a0be0357dd5bac2de11b3b6583b46cd89cc1109c07242e"
S = "${WORKDIR}/gx_sound-release-release-kinetic-gx_sound_msgs-0.2.2-0"

inherit catkin
