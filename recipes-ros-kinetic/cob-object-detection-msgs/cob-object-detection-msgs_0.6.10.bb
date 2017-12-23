# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains message type definitions for object detection"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/kinetic/cob_object_detection_msgs/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eecf06c1cc0329d815e16b17afb6b8ad"
SRC_URI[sha256sum] = "a06bc045aad1e5948e8444b969cc5445569c3f5d3be3f2a7a3c97f1c1b06167d"
S = "${WORKDIR}/cob_perception_common-release-release-kinetic-cob_object_detection_msgs-0.6.10-0"

inherit catkin
