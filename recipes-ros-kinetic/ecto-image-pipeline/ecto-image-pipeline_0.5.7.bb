# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common tools for image based pipelines. Includes stereo and mono camera drivers,"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules ecto ecto-opencv ecto-ros eigen opencv-candidate"
SRC_URI = "https://github.com/ros-gbp/ecto_image_pipeline-release/archive/release/kinetic/ecto_image_pipeline/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "49ac133d19986338ba7b0ef4a8275608"
SRC_URI[sha256sum] = "9560ea03b3aafe4a085d9c2a590bece99d94fe992bec2f8bb61124a990434d99"
S = "${WORKDIR}/ecto_image_pipeline-release-release-kinetic-ecto_image_pipeline-0.5.7-0"

inherit catkin
