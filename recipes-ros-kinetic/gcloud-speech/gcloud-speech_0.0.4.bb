# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Google Cloud Speech client."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native gcloud-speech-msgs grpc libgflags-dev libgoogle-glog-dev"
SRC_URI = "https://github.com/CogRobRelease/gcloud_speech-release/archive/release/kinetic/gcloud_speech/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9203816d30c6a0116498fdf4f417981"
SRC_URI[sha256sum] = "73b84f2e1ae0f84e90d7e676b01bbd089330a43391b81cfe8e8526b0cd040b71"
S = "${WORKDIR}/gcloud_speech-release-release-kinetic-gcloud_speech-0.0.4-0"

inherit catkin
