# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Google Cloud Speech client."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native catkin gcloud-speech-msgs grpc libgflags-dev libgoogle-glog-dev"
SRC_URI = "https://github.com/CogRobRelease/gcloud_speech-release/archive/release/lunar/gcloud_speech/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4373df15ba06166868d2779c378e07e1"
SRC_URI[sha256sum] = "e7ba752e17754631ebe61e8ed78f1470bc94c6208f76eb3a2f696aded70954b4"
S = "${WORKDIR}/gcloud_speech-release-release-lunar-gcloud_speech-0.0.4-0"

inherit catkin
