# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "basic 3d reconstruction of an object from aligned Kinect data"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules ecto ecto-image-pipeline ecto-pcl meshlab object-recognition-core opencv-candidate sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/object_recognition_reconstruction-release/archive/release/kinetic/object_recognition_reconstruction/0.3.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "29bdc475b3372b75ab3f4a745753bb1e"
SRC_URI[sha256sum] = "4f670fb39bcd5753c409b409396a0229669dcf0a82a6ce953f5c3eaaf765cc69"
S = "${WORKDIR}/object_recognition_reconstruction-release-release-kinetic-object_recognition_reconstruction-0.3.6-0"

inherit catkin
