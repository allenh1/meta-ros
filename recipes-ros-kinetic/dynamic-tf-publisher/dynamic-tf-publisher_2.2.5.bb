# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "dynamically set the tf trensformation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs message-generation message-runtime rospy tf"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/dynamic_tf_publisher/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ed7a25b0bc50f38c66ec1dd8e17a2b47"
SRC_URI[sha256sum] = "5cc920b28a6e5087ffbb75088375f1020e365527fe255fe8aebf9141c908ee44"
S = "${WORKDIR}/jsk_common-release-release-kinetic-dynamic_tf_publisher-2.2.5-0"

inherit catkin
