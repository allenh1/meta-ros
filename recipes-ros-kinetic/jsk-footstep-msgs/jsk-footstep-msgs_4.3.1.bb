# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_footstep_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/kinetic/jsk_footstep_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "89d1dfde97514da5e8809f2be5164348"
SRC_URI[sha256sum] = "2632bea84709f7eb64f4d5df99829d46495d51c4b299819656b8d64ef1e09e90"
S = "${WORKDIR}/jsk_common_msgs-release-release-kinetic-jsk_footstep_msgs-4.3.1-0"

inherit catkin
