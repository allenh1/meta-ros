# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message, service and action definitions for environment perception."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib actionlib-msgs catkin-native cob-object-detection-msgs geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/kinetic/cob_3d_mapping_msgs/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e233d1c962b99edb16f8025f96784c2b"
SRC_URI[sha256sum] = "2e682a37a2394a7fb095c3e7be25d510462d4fb5e9314d0507df5043b56d09b0"
S = "${WORKDIR}/cob_perception_common-release-release-kinetic-cob_3d_mapping_msgs-0.6.10-0"

inherit catkin
