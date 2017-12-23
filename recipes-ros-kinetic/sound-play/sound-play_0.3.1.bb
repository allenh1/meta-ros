# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "sound_play provides a ROS node that translates commands on a ROS topic () into s"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

DEPENDS = "actionlib actionlib-msgs audio-common-msgs catkin-native diagnostic-msgs festival gstreamer1.0 gstreamer1.0-plugins-base gstreamer1.0-plugins-good gstreamer1.0-plugins-ugly message-generation message-runtime python-gi roscpp roslib rospy"
SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/kinetic/sound_play/0.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c194c588deb414a5e79761ee3e1fe739"
SRC_URI[sha256sum] = "f2cdcdc6ee8fa29cde08069cb75d773d6c9c549e19f586c88b6387d10c95a152"
S = "${WORKDIR}/audio_common-release-release-kinetic-sound_play-0.3.1-0"

inherit catkin
