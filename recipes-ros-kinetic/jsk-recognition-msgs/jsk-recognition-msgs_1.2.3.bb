# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for jsk_pcl_ros and jsk_perception."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs jsk-footstep-msgs message-generation pcl-msgs sensor-msgs std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/kinetic/jsk_recognition_msgs/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4fa692f107f960ff8f13f98995310469"
SRC_URI[sha256sum] = "eee7b6752660d47d54c1055e49c906cab5c183f62c9459d1b52095e1aa68a8a3"
S = "${WORKDIR}/jsk_recognition-release-release-kinetic-jsk_recognition_msgs-1.2.3-0"

inherit catkin
