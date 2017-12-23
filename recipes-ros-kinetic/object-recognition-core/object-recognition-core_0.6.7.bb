# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "object_recognition_core contains tools to launch several recognition pipelines, "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules couchdb curl ecto ecto-image-pipeline sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/object_recognition_core-release/archive/release/kinetic/object_recognition_core/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc4c78c7704317071425b6803382a9d5"
SRC_URI[sha256sum] = "2a1e83129053e512369073abc6bcd08e39d7d4f7887e921af93cfa59c526ff13"
S = "${WORKDIR}/object_recognition_core-release-release-kinetic-object_recognition_core-0.6.7-0"

inherit catkin
