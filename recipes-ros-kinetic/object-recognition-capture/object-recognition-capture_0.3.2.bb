# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Capture is a set of tools to capture objects in 3D and perform odometry"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native ecto ecto-image-pipeline ecto-opencv ecto-openni ecto-ros object-recognition-core"
SRC_URI = "https://github.com/ros-gbp/object_recognition_capture-release/archive/release/kinetic/object_recognition_capture/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb3f1cddf5bf81216357f2844377d578"
SRC_URI[sha256sum] = "a8071741c6d75abf5e8b0d9119a124f165cbef7f7a327789768ac87c3fb3d256"
S = "${WORKDIR}/object_recognition_capture-release-release-kinetic-object_recognition_capture-0.3.2-0"

inherit catkin
