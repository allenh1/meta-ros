# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Textured Object Recognition a standard bag of features approach"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules ecto ecto-opencv ecto-openni eigen object-recognition-core opencv-candidate"
SRC_URI = "https://github.com/ros-gbp/object_recognition_tod-release/archive/release/kinetic/object_recognition_tod/0.5.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "69efb8a5ca16803e6cbf9058049c91bf"
SRC_URI[sha256sum] = "5dc450600dc5efc57ce501d9e67d3cc5a2520388438264af655f653268f25515"
S = "${WORKDIR}/object_recognition_tod-release-release-kinetic-object_recognition_tod-0.5.6-0"

inherit catkin
