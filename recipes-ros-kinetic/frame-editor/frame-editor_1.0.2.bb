# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The frame_editor package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs interactive-markers message-generation message-runtime rospy rqt-gui rqt-gui-py std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ipa320/rqt_frame_editor_plugin-release/archive/release/kinetic/frame_editor/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "749e922534515ea42ebb0a2f544778f2"
SRC_URI[sha256sum] = "1cdad202b5519801ff03917e35f735e847ee84739dd727fe832ee7e8d1a19133"
S = "${WORKDIR}/rqt_frame_editor_plugin-release-release-kinetic-frame_editor-1.0.2-0"

inherit catkin
