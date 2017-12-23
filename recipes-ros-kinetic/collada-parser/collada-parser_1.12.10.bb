# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a C++ parser for the Collada robot     description format."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native class-loader collada-dom liburdfdom-headers-dev roscpp urdf urdf-parser-plugin"
SRC_URI = "https://github.com/ros-gbp/collada_urdf-release/archive/release/kinetic/collada_parser/1.12.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "93be2d58024afd3fb8a465111d049ba7"
SRC_URI[sha256sum] = "7458c11868ecfb20b8337f7104f4096afee8b65b845f297754b9df3b30b0ded8"
S = "${WORKDIR}/collada_urdf-release-release-kinetic-collada_parser-1.12.10-0"

inherit catkin
