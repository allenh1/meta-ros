# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_topic_tools"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater dynamic-reconfigure dynamic-tf-publisher eigen-conversions geometry-msgs image-transport message-generation message-runtime nodelet python-numpy python-opencv python-scipy roscpp roslaunch rosnode rostest rostime rostopic sensor-msgs sound-play std-msgs std-srvs tf topic-tools"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/jsk_topic_tools/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6c2fb78e782cc1c127e27bb1915e2aef"
SRC_URI[sha256sum] = "6bf488ca3333eab765c0ea763fbc2ae173d14736c962a58d588d21a97dc67dc4"
S = "${WORKDIR}/jsk_common-release-release-kinetic-jsk_topic_tools-2.2.5-0"

inherit catkin
