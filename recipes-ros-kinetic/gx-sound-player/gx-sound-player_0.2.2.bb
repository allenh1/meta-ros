# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The gx_sound_player package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gx-sound-msgs rospy vorbis-tools"
SRC_URI = "https://github.com/groove-x/gx_sound-release/archive/release/kinetic/gx_sound_player/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3f955682b9ca2f7828ec9bbdd72d5e21"
SRC_URI[sha256sum] = "564ce007cb5481ca0c85addfffa092708e40e513c73627422e49782a945259d5"
S = "${WORKDIR}/gx_sound-release-release-kinetic-gx_sound_player-0.2.2-0"

inherit catkin
