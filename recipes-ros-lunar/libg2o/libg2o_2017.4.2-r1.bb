# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The libg2o library from http://openslam.org/g2o.html"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=3c454298c7a2143f945945900f196cd2"

DEPENDS = "boost catkin cmake eigen opengl suitesparse"
SRC_URI = "https://github.com/ros-gbp/libg2o-release/archive/release/lunar/libg2o/2017.4.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b6efda91b27c1d9186e104ad41862044"
SRC_URI[sha256sum] = "9364f946e8412b3f6b45b91bfd05563616ee6fc37fb22e8c31970495f0e108ce"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
