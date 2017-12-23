# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS message definitions for gcloud_speech and relevant packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/CogRobRelease/gcloud_speech-release/archive/release/kinetic/gcloud_speech_msgs/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a98d5a2a5302317c4c9a9fb17d9f8d19"
SRC_URI[sha256sum] = "e0c8922c59f6ee2a633fc1a1afc954f7a43c4858342124a579709288365f0e37"
S = "${WORKDIR}/gcloud_speech-release-release-kinetic-gcloud_speech_msgs-0.0.4-0"

inherit catkin
