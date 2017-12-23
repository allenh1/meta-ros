# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A technique to recognize and estimate poses of transparent objects"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecto ecto-opencv object-recognition-core pcl-ros proj"
SRC_URI = "https://github.com/ros-gbp/object_recognition_transparent_objects-release/archive/release/kinetic/object_recognition_transparent_objects/0.4.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c5a6fb3cac3bf28ed0e3aedd3bb9ce2e"
SRC_URI[sha256sum] = "547e753c67f40c949267ee6561e089c8107c009641abb060f9b2798b98b408a5"
S = "${WORKDIR}/object_recognition_transparent_objects-release-release-kinetic-object_recognition_transparent_objects-0.4.3-0"

inherit catkin
