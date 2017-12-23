# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS nodes to publish resized images."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge image-transport jsk-topic-tools message-generation message-runtime nodelet sensor-msgs std-srvs"
SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/kinetic/resized_image_transport/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c1a82330d813bc12fc47c73aee2d7b1"
SRC_URI[sha256sum] = "52298647ee972f6e7a0f22df320e928ce3cbdae1a44dbbbf95249910ba46fb41"
S = "${WORKDIR}/jsk_recognition-release-release-kinetic-resized_image_transport-1.2.3-0"

inherit catkin
